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
if(dataBaseBean.getDriver()==null) return "AdminIndex";
return "Installer";
}
}