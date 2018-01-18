//先校验,再提交
function submitForm(formId) {
	// 校验表单
	if ($('#' + formId).form('validate')) {
		// 提交表单
		$('#' + formId).submit();
	}
}

// 自动将表单参数提取,并封装为json的工具方法
$.fn.serializeJson = function() {
	var serializeObj = {};
	var array = this.serializeArray();
	var str = this.serialize();
	$(array).each(
			function() {
				if (serializeObj[this.name]) {
					if ($.isArray(serializeObj[this.name])) {
						serializeObj[this.name].push(this.value);
					} else {
						serializeObj[this.name] = [ serializeObj[this.name],
								this.value ];
					}
				} else {
					serializeObj[this.name] = this.value;
				}
			});
	return serializeObj;
};
