package com.thinking.machines.msgboard.beans;
import java.util.*;
import java.math.*;
public class InstallationBean implements java.io.Serializable
{
private String driver;
private String connectionString;
private String username;
private String password;
private String administratorUsername;
private String administratorPassword;
public InstallationBean()
{
this.driver="";
this.connectionString="";
this.username="";
this.password="";
this.administratorUsername=null;
this.administratorPassword=null;
System.out.print("Intstallation bean instantiated");
}
public void setDriver(java.lang.String driver)
{
this.driver=driver;
}
public java.lang.String getDriver()
{
return this.driver;
}
public void setConnectionString(java.lang.String connectionString)
{
this.connectionString=connectionString;
}
public java.lang.String getConnectionString()
{
return this.connectionString;
}
public void setUsername(java.lang.String username)
{
this.username=username;
}
public java.lang.String getUsername()
{
return this.username;
}
public void setPassword(java.lang.String password)
{
this.password=password;
}
public java.lang.String getPassword()
{
return this.password;
}
public void setAdministratorUsername(String administratorUsername)
{
this.administratorUsername = administratorUsername;
}
public void setAdministratorPassword(String administratorPassword)
{
this.administratorPassword = administratorPassword;
}
public String getAdministratorUsername()
{
return this.administratorUsername;
}
public String getAdministratorPassword()
{
return this.administratorPassword;
}
}
