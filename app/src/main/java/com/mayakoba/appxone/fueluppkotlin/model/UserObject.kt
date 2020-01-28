import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UserObject (

	@SerializedName("id") val id : Int,
	@SerializedName("imei") val imei : Long,
	@SerializedName("userName") val userName : String,
	@SerializedName("mobileNo") val mobileNo : String,
	@SerializedName("cnic") val cnic : Long,
	@SerializedName("firstName") val firstName : String,
	@SerializedName("lastName") val lastName : String,
	@SerializedName("gender") val gender : String,
	@SerializedName("country") val country : String,
	@SerializedName("city") val city : String,
	@SerializedName("email") val email : String,
	@SerializedName("productName") val productName : String,
	@SerializedName("tokenNo") val tokenNo : Long,
	@SerializedName("tokenNoTime") val tokenNoTime : String,
	@SerializedName("status") val status : String,
	@SerializedName("isRegister") val isRegister : String,
	@SerializedName("invalidLoginAttempts") val invalidLoginAttempts : Int,
	@SerializedName("insertedOn") val insertedOn : String,
	@SerializedName("tokenNoMobile") val tokenNoMobile : Double,
	@SerializedName("tokenNoMobileTime") val tokenNoMobileTime : String,
	@SerializedName("mPinGenerate") val mPinGenerate : String,
	@SerializedName("identity") val identity : String,
	@SerializedName("securityQuestionSubmitted") val securityQuestionSubmitted : String,
	@SerializedName("userId") val userId : String,
	@SerializedName("lastLoginOn") val lastLoginOn : String,
	@SerializedName("userImageString") val userImageString : String
) : Serializable