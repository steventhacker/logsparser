package com.warcrafttool.helpers;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Helpers for the handlebars framework
 */
public class HandlebarsHelpers
{
	public static String numberFormat(Long number)
	{
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
		return numberFormat.format(number);
	}
}
