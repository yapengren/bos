
		$(function() {
			//jquery.validate
			$("#jsForm,#login").validate({
				submitHandler: function() {
					//验证通过后 的js代码写在这里
				}
			})

		})

		//下面是一些常用的验证规则扩展

		//配置错误提示的节点，默认为label，这里配置成 span （errorElement:'span'）
		$.validator.setDefaults({
			errorElement: 'span'
		});

		//配置通用的默认提示语
		$.extend($.validator.messages, {
			required: '必填',
			equalTo: "请再次输入相同的值"
		});

		/*-------------扩展验证规则 懒人建站http://www.51xuediannao.com/-------------*/
		//邮箱 
		jQuery.validator.addMethod("mail", function(value, element) {
			var mail = /^[a-z0-9._%-]+@([a-z0-9-]+\.)+[a-z]{2,4}$/;
			return this.optional(element) || (mail.test(value));
		}, "邮箱格式不对");

		//手机验证规则  
		jQuery.validator.addMethod("mobile", function(value, element) {
			var mobile = /^1[3|4|5|7|8]\d{9}$/;
			return this.optional(element) || (mobile.test(value));
		}, "手机格式不对");

		//邮箱或手机验证规则  
		jQuery.validator.addMethod("mm", function(value, element) {
			var mm = /^[a-z0-9._%-]+@([a-z0-9-]+\.)+[a-z]{2,4}$|^1[3|4|5|7|8]\d{9}$/;
			return this.optional(element) || (mm.test(value));
		}, "格式不对");
         function show() {
						var format1 = document.getElementById("format1");
						var format2 = document.getElementById("format2");
						if(event.target.value === "0") {
							format1.style.display = "";
							format2.style.display = "none";
						} else if(event.target.value === "1") {
							format1.style.display = "none";
							format2.style.display = "";
						}
					}
