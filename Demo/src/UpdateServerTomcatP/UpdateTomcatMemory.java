/*package UpdateServerTomcatP;

import java.util.ArrayList;

public class UpdateTomcatMemory {

	public static void main(String[] args) {

	}

	void UpdateMemmory() 
    {
        try
        {
            RegistryKey root = Registry.LocalMachine;
            RegistryKey software = root.OpenSubKey("SOFTWARE", true);
            RegistryKey asf = software.OpenSubKey("Apache Software Foundation", true);
            RegistryKey pru = asf.OpenSubKey("Procrun 2.0", true);
            //RegistryKey tl = pru.OpenSubKey("tomcatloan", true);
            RegistryKey tl = pru.OpenSubKey(CommonMethod.GetTomcatName(), true);
            RegistryKey Parameters = tl.OpenSubKey("Parameters", true);
            RegistryKey java = Parameters.OpenSubKey("Java", true);
            String[] strarray = java.GetValue("Options") as string[];
            if (strarray != null)
            {
                Boolean flag = true;
                ArrayList<String> al = new ArrayList<String>();
                for (int i = 0; i < strarray.length; i++)
                {
                    //if (strarray[i] == "-Xrs 每Xms512m 每Xmx1024m")
                    if(strarray[i].StartsWith("-Xrs 每Xms1024m 每Xmx4096m"))
                    {
                        flag = false;
                    }
                    al.add(strarray[i]);
                }
                if (flag)
                {
                    al.add("-Xrs 每Xms1024m 每Xmx4096m");
                    al.add("-XX:PermSize=256M");
                    al.add("-XX:MaxPermSize=256M");
                    java.SetValue("Options", (String[])al.ToArray(typeof(string)), RegistryValueKind.MultiString);
                }
            }
        }
        catch(Exception e)
        {
            
        }
    }
}
*/