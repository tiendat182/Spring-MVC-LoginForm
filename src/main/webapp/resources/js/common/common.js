/**
 * Functions common</br>
 * Author : DatLT</br>
 * Date    : 2017/02/18
 */

(function($){

/**
 * 	Check empty for input value
 * @param	value
 * @return	{true} if parameter is null or blank, otherwise is {false}
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
 * @return	{true} if parameter is Not null, blank, undefine, otherwise is {false}
 */
function isNotEmpty(value) {
	return !(isEmpty(value));
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
}




})(jQuery);