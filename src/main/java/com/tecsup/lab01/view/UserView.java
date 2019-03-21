package com.tecsup.lab01.view;
import com.tecsup.lab01.controller.*;

import com.tecsup.lab01.controller.*;
public class UserView {
	
		UserController u = new UserController();
		String nc= u.getNombreCompleto();
		
		public void imprimir() {
			System.out.println(nc);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
}
