/**
 * Functions common</br>
 * Author : DatLT</br>
 * Date    : 2017/02/18
 */

/**
 * 	Check empty for input value
 * @param	value
 * @return	<b>true</b> if parameter is [null, blank, undefine]; otherwise is <b>false</b>
 */
function isEmpty(value) {
	if (value != void 0 && value != null && value != "") {
		return false;
	}
	return true;
}

/**
 * 	Check Not empty for input value
 * @param	value
 * @return	{true} if parameter is Not null, not blank, not undefine, otherwise is {false}
 */
function isNotEmpty(value) {
	return !(isEmpty(value));
}

/**
 * @param inStr	String padding
 * @param len	Length after padding
 * @param padChar	Character using to pad
 * @returns {String}
 */
function padLeft(inStr, len, padChar) {
	return _padLeft(inStr, len, padChar, true);
}

/**
 * @param inStr	String padding
 * @param len	Length after padding
 * @param padChar	Character using to pad
 * @returns {String}
 */
function padRight(inStr, len, padChar) {
	return _padLeft(inStr, len, padChar, false);
}

/**
 * Padding character
 * @param inStr	String padding
 * @param len	Length after padding
 * @param padChar	Character using to pad
 * @param padLeft	<b>true</b>: padding left; <b>false</b>: padding right
 * @return String after padding
 */
function _padLeft(inStr, len, padChar, padLeft) {
	var outStr = inStr + "";
	outStr = isEmpty(outStr) ? "": outStr;

	// Check character padding
	if (isEmpty(padChar) || padChar.length > 1) {
		return outStr;
	}

	if (outStr.length >= len) {
		return outStr;
	}

	// Generate character to be added
	var pad ="";
	for(var i = outStr.length; i < len; i++) {
		pad += padChar;
	}
	// Append character string to output string
	if (padLeft) {
		outStr = pad + outStr;
	} else {
		outStr = outStr + pad;
	}
	return outStr;
}

/**
 * Format date to yyyyMMddHHmmssSSS.
 * @param	date
 * @param	format
 * @return	{yyyyMMddHHmmssSSS} format if date is not empty, otherwise is {null}
 */
function formatDate(date, format) {
	if (isEmpty(date)) {
		return null;
	}

	var result = format;
	// Year
	if (result.indexOf("yyyy") > -1) {
		result = result.replace(/yyyy/, date.getFullYear());
	}
	// Month
	if (result.indexOf("MM") > -1) {
		result = result.replace(/MM/, padLeft(date.getMonth(), 2, "0", true));
	}
	// Day
	if (result.indexOf("dd") > -1) {
		result = result.replace(/dd/, padLeft(date.getDate(), 2, "0", true));
	}
	// Hour
	if (result.indexOf("HH") > -1) {
		result = result.replace(/HH/, padLeft(date.getHours(), 2, "0", true));
	}
	// Minute
	if (result.indexOf("mm") > -1) {
		result = result.replace(/mm/, padLeft(date.getHours(), 2, "0", true));
	}
	// Seconds
	if (result.indexOf("ss") > -1) {
		result = result.replace(/ss/, padLeft(date.getHours(), 2, "0", true));
	}
	// Milliseconds
	if (result.indexOf("SSS") > -1) {
		result = result.replace(/SSS/, padLeft(date.getHours(), 3, "0", true));
	}
	return result;
}

/**
 * Get system date
 * @param format
 * @return date with format yyyyMMdd if parameter Format is Null, otherwise is yyyyMMddHHmmssSSS
 */
function getSystemDate(format) {
	if (isEmpty(format)) {
		format = "yyyyMMdd";
	}
	var nowDate = new Date();
	
	return formatDate(nowDate, format);
}


















