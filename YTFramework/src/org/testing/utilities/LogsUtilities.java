package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsUtilities {
	public static void takelogs(String message, String classname)
	{
		DOMConfigurator.configure("../YTFramework/layout.xml");
		Logger l=Logger.getLogger(classname);
		l.info(message);
		}
}
