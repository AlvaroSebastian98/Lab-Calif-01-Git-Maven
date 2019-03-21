package com.tecsup.lab01.controller;
import com.tecsup.lab01.model.*;

public class UserController extends User{	

	public String getNombreCompleto() {
		return nombres+" "+apellidoP+" "+apellidoM+"\n"+"Edad: "+edad;
	}	
	
	
	
}
