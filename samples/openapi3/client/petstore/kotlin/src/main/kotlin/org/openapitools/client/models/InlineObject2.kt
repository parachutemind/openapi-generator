/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
/**
 * 
 * @param enumFormStringArray Form parameter enum test (string array)
 * @param enumFormString Form parameter enum test (string)
 */
data class InlineObject2 (
    /* Form parameter enum test (string array) */
    @Json(name = "enum_form_string_array")
    val enumFormStringArray: kotlin.Array<InlineObject2.EnumFormStringArray>? = null,
    /* Form parameter enum test (string) */
    @Json(name = "enum_form_string")
    val enumFormString: InlineObject2.EnumFormString? = null
)

{
    /**
    * Form parameter enum test (string array)
    * Values: GREATER_THAN,DOLLAR
    */
    enum class EnumFormStringArray(val value: kotlin.String){
    
        @Json(name = ">") GREATER_THAN(">"),
    
        @Json(name = "$") DOLLAR("$");
    
    }
}

{
    /**
    * Form parameter enum test (string)
    * Values: _ABC,MINUSEFG,LEFT_PARENTHESISXYZRIGHT_PARENTHESIS
    */
    enum class EnumFormString(val value: kotlin.String){
    
        @Json(name = "_abc") _ABC("_abc"),
    
        @Json(name = "-efg") MINUSEFG("-efg"),
    
        @Json(name = "(xyz)") LEFT_PARENTHESISXYZRIGHT_PARENTHESIS("(xyz)");
    
    }
}


