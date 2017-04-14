KISSY.add('common-module/src/formToken', function(S, Node, Event, IO, Json, I18N, AlertMsg, Common) {
	function FormToken() {
		var $ = Node.all;
		var _this = this;
		var tokenId = "_form_token_id";

		/*
		 * 获得TokenId
		 */
		this.initFormToken = function() {
			var $fromToken = $("#" + tokenId);
			if ($fromToken) {
				$fromToken.remove();
			}

			if ($("#formToken")) {
				var $hiddenInput = "<input type='hidden' id='" + tokenId + "' name='" + tokenId + "' >";
				$("#formToken").append($hiddenInput);
				new IO({
					url : "formTokenController/getFormToken.action",
					type : "post",
					data : "",
					success : function(databack) {
						if (databack !== null && databack !== "") {
							$("#" + tokenId).val(databack);
						}
					}
				});

			}
		};

		/*
		 * 提交Token表单
		 */
		this.submitFormToken = function(requestUrl, requestType, jsonData, successCallback, errorCallback) {
			new IO({
				url : requestUrl,
				json : "application/json, text/javascript",
				type : requestType,
				data : _this.apendTokenJsonDate(jsonData),
				success : function(databack) {
					_this.processResultDate(databack, successCallback);
				},
				error : function(errback) {
					_this.processResultDate(errback, errorCallback);
				}
			});
		};

		this.processResultDate = function(resultBack, func) {
			_this.initFormToken();
			if (resultBack && KISSY.isString(resultBack) && KISSY.JSON.parse(resultBack).tokenResult === "304") {
				IO.get("views/common/validate.html", null, function() {
					var msg = "表单重复提交！";
					var errorTitle = "表单提交失败";
					$("#finaceright").html(arguments[0], true);
					$("#msgTitle").html(errorTitle);
					$("#msgInfo").html(msg);
					$("#msgInfo").attr("class", "Content3");
					$("#repayment_back").remove();
				}, "html");
			} else {
				if (KISSY.isFunction(func)) {
					func(resultBack);
				}
			}
		};

		/*
		 * 给指定的jsonDate增加TokenId属性
		 */
		this.apendTokenJsonDate = function(jsonDate) {
			if (jsonDate) {
				jsonDate[tokenId] = _this.getCurrFormTokenValue();
			}
			return jsonDate;
		};

		/*
		 * 获得tokenId属性名
		 */
		this.getCurrFormTokenName = function() {
			return tokenId;
		};

		/*
		 * 获得tokenId属性名
		 */
		this.getCurrFormTokenValue = function() {
			return $("#" + tokenId).val();
		};
	}
	return FormToken;
}, {
	requires : [ 'node', 'event', 'io', 'json', 'common-module/src/i18n', 'common-module/src/alertDialog', 'common-module/src/common' ]
});
