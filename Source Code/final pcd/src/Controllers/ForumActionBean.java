package Controllers;

import net.sourceforge.stripes.action.ActionBean;

import net.sourceforge.stripes.action.ActionBeanContext;

public abstract class ForumActionBean implements ActionBean{

	private ForumActionBeanContext context;

	public ForumActionBeanContext getContext() {
		return context;
	}

	
	public void setContext(ActionBeanContext context) {
		this.context = (ForumActionBeanContext) context;
	}

	
}