import com.google.gson.annotations.SerializedName
import java.io.Serializable

/*
Copyright (c) 2019 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class Ministatement (

	@SerializedName("rrn") val rrn : Long,
	@SerializedName("prevRetRef") val prevRetRef : String,
	@SerializedName("cardNo") val cardNo : Long,
	@SerializedName("merchantId") val merchantId : Long,
	@SerializedName("merchantName") val merchantName : String,
	@SerializedName("terminalId") val terminalId : Int,
	@SerializedName("nii") val nii : Int,
	@SerializedName("txnType") val txnType : String,
	@SerializedName("productCode") val productCode : String,
	@SerializedName("txnAmount") val txnAmount : String,
	@SerializedName("rspCode") val rspCode : Int,
	@SerializedName("rejReason") val rejReason : String,
	@SerializedName("settleFlag") val settleFlag : String,
	@SerializedName("invNo") val invNo : Int,
	@SerializedName("traceNo") val traceNo : Int,
	@SerializedName("txnDate") val txnDate : Int,
	@SerializedName("txnTime") val txnTime : Int
) : Serializable