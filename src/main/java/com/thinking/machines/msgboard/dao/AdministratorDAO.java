package com.thinking.machines.msgboard.dao;
import java.sql.*;
import com.thinking.machines.msgboard.dto.*;
public class AdministratorDAO
{
public void add(Administrator administrator) throws DAOException
{
try
{
Connection connection=DAOConnection.getConnection();
PreparedStatement preparedStatement;
preparedStatement=connection.prepareStatement("inser into administartor values(?,?,?)");
preparedStatement.setString(1,administrator.getUsername());
preparedStatement.setString(2,administrator.getPassword());
preparedStatement.setString(3,administrator.getPasswordKey());
preparedStatement.executeUpdate();
preparedStatement.close();
connection.close();
}catch(SQLException sqlException)
{
System.out.println(sqlException); // latyer on add to log an remove this
throw new DAOException("Unable to add administration");
}
}
}