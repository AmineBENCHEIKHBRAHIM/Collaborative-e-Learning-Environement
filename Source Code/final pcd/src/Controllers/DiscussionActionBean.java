package Controllers;
import DAO.*;
import Domain.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

import cryptage.MD5Password;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;


public class DiscussionActionBean extends ForumActionBean{
	

	private String msg;




	@DefaultHandler
	public Resolution create() {
		
	
    	
    	
    	
    	ForumBeanManager fbm = new ForumBeanManager();
    	

    	
    	Discussion disc = new Discussion();
    	disc.setDate(""+new Date());
    	disc.setMsg(msg);
   	    disc.setReceiver(16);
   	    disc.setSender(16);
    	
    	
    	
    	
    	fbm.ajouterDiscussion(disc);
    	
    	
    	
    	return new RedirectResolution("/login.jsp").flash(this);

    }

}
