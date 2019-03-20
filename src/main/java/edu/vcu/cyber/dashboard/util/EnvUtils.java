package edu.vcu.cyber.dashboard.util;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Objects;

public class EnvUtils
{

	public static void setGraphStreamRenderer()
	{
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
	}

	public static void setGlobalUIFont(javax.swing.plaf.FontUIResource f)
	{
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements())
		{
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource)
				UIManager.put(key, f);
		}
	}

	public static void setLookAndFeel()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		} catch (Exception e)
		{
			// handle exception
		}
	}

	public static void registerFonts()
	{


		try
		{
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

			Enumeration<URL> en = EnvUtils.class.getClassLoader().getResources("/font/");
			while(en.hasMoreElements())
			{
				URL url = en.nextElement();
//				System.out.println(url);
			}

			for (File f : Objects.requireNonNull(new File("./src/main/resources/font/").listFiles()))
			{
				if (f.getName().endsWith(".ttf"))
				{
					Font font = Font.createFont(Font.TRUETYPE_FONT, f);
					ge.registerFont(font);
				}
			}
		} catch (IOException | FontFormatException e)
		{
			e.printStackTrace();
			//Handle exception
		}


	}
}
