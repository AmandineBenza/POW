package com.dzoum.pow.graphics;

import javax.swing.JFrame;

import com.dzoum.pow.main.Core;
import com.dzoum.pow.utils.Config;

public class Window {

	private JFrame win;
	private Core core;
	private Config config;
	
	public Window(Core core, Config config){
		this.win = new JFrame(config.getGameTitle());
		this.core = core;
		this.config = config;
	}
	
	public Core getCore(){
		return core;
	}
	
	private void setDefaultState(){
		win.add(core);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setResizable(false);
		win.pack();
		win.setLocationRelativeTo(null);
	}
	
	public void start(){
		setDefaultState();
		win.setVisible(true);
	}
	
	public void setTitle(String newTitle){
		win.setTitle(config.getGameTitle() + " | " + newTitle);
	}
	
}