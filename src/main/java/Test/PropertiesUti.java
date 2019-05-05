package Test;

import jdk.nashorn.internal.ir.CatchNode;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUti
{

    public String proper()
  {
      try
      {
          Properties pro = new Properties();
          String root = System.getProperty("user.dir");
          FileInputStream ip = new FileInputStream(root+"/TestData/Config.properties");
          pro.load(ip);
          return pro.getProperty("Browser");
      }
      catch (Exception exp)
      {
          exp.printStackTrace();
          return null;
/// nnn
      }



    }

}
