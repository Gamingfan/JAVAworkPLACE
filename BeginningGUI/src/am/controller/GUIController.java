package am.controller;

import am.view.GUIFrame;

public class GUIController
{
	private GUIFrame appFrame;
	
	public void start()
	{
		appFrame = new GUIFrame(this);
	}

}
