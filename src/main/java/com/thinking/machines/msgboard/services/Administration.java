package com.thinking.machines.msgboard.services;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import com.thinking.machines.msgboard.beans.*;
@Controller
public class Administration 
{
@Autowired
private DataBaseBean dataBaseBean;
@GetMapping("/admin")
public String adminIndex()
{
if(dataBaseBean.getDriver()==null) return "Installer";
return "AdminIndex";
}
@PostMapping("/install")
public String installMessageBoard(InstallationBean installationBean)
{
System.out.println(installationBean.getDriver());
System.out.println(installationBean.getConnectionString());
System.out.println(installationBean.getUsername());
System.out.println(installationBean.getPassword());
System.out.println(installationBean.getAdministratorUsername());
System.out.println(installationBean.getAdministratorPassword());
// you need to write the code to get the table created 
// if created, then set driver etc. in DaoConnection
// call add of AdministratorDAO
// if all is well, then return InstallationSuccessful
return "InstallationFailed";
}
}