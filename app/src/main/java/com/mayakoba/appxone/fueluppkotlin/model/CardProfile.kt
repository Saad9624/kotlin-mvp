import com.google.gson.annotations.SerializedName
import java.io.Serializable

/*
Copyright (c) 2019 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class CardProfile (

	@SerializedName("cardNo") val cardNo : Double,
	@SerializedName("expd") val expd : Int,
	@SerializedName("accNo") val accNo : Double,
	@SerializedName("cardName") val cardName : String,
	@SerializedName("cardStatus") val cardStatus : String,
	@SerializedName("cardType") val cardType : String,
	@SerializedName("priCardFlag") val priCardFlag : String,
	@SerializedName("priCardNo") val priCardNo : Double,
	@SerializedName("cardLimitType") val cardLimitType : String,
	@SerializedName("txnLimit") val txnLimit : Int,
	@SerializedName("dailyLimit") val dailyLimit : Int,
	@SerializedName("weeklyLimit") val weeklyLimit : Int,
	@SerializedName("monthlyLimit") val monthlyLimit : Int,
	@SerializedName("yearlyLimit") val yearlyLimit : Int,
	@SerializedName("nonfuelMonthlyLimit") val nonfuelMonthlyLimit : Int,
	@SerializedName("dailyFreqLimit") val dailyFreqLimit : Int,
	@SerializedName("weeklyFreqLimit") val weeklyFreqLimit : Int,
	@SerializedName("daysAllowed") val daysAllowed : Int,
	@SerializedName("dailyQtyUsage") val dailyQtyUsage : Int,
	@SerializedName("dailyAmtUsage") val dailyAmtUsage : Int,
	@SerializedName("weeklyQtyUsage") val weeklyQtyUsage : Double,
	@SerializedName("weeklyAmtUsage") val weeklyAmtUsage : Double,
	@SerializedName("monthlyQtyUsage") val monthlyQtyUsage : Double,
	@SerializedName("monthlyAmtUsage") val monthlyAmtUsage : Double,
	@SerializedName("yearlyQtyUsage") val yearlyQtyUsage : Double,
	@SerializedName("yearlyAmtUsage") val yearlyAmtUsage : Double,
	@SerializedName("availiableRewardPoints") val availiableRewardPoints : Int,
	@SerializedName("txnBalance") val txnBalance : Int,
	@SerializedName("dailyBalance") val dailyBalance : Int,
	@SerializedName("weeklyBalance") val weeklyBalance : Int,
	@SerializedName("monthlyBalance") val monthlyBalance : Int,
	@SerializedName("issueDate") val issueDate : Int,
	@SerializedName("accName") val accName : String,
	@SerializedName("coAccKey") val coAccKey : Int
) : Serializable