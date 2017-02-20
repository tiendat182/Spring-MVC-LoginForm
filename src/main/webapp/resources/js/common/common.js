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
	inStr = isEmpty(inStr) ? "": inStr;

	var outStr = inStr;
	if (isEmpty(len)) {
		return outStr;
	}
	if (isEmpty(padChar) || padChar.length > 1) {
		return outStr;
	}
	if (inStr.length < len) {
		for(var i = inStr.length; i < len; i++) {
			if (padLeft) {
				outStr = padChar + outStr;
			} else
				outStr = outStr + padChar;
		}
	}
	return outStr;
}

/**
 * Format date to YYYYMMDD.
 * @param	date
 * @param	format
 * @return	{YYYYMMDD} format if date is not empty, otherwise is {null}
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
	if (result.indexOf("mm") > -1){
		result = result.replace(/mm/, date.getMonth());
	}
	// Day
	if (result.indexOf("dd") > -1){
		result = result.replace(/dd/, date.getDate());
	}
}

