import com.fasterxml.jackson.annotation.JsonProperty

data class EcommerceOrder(
        @JsonProperty("category")
        val categoryList: List<String>,
        @JsonProperty("currency")
        val currency: String,
        @JsonProperty("customer_first_name")
        val customerFirstName: String,
        @JsonProperty("customer_full_name")
        val customerFullName: String,
        @JsonProperty("customer_gender")
        val customerGender: String,
        @JsonProperty("customer_id")
        val customerId: Int,
        @JsonProperty("customer_last_name")
        val customerLastName: String,
        @JsonProperty("customer_phone")
        val customerPhone: String,
        @JsonProperty("day_of_week")
        val dayOfWeek: String,
        @JsonProperty("day_of_week_i")
        val dayOfWeekI: Int,
        @JsonProperty("email")
        val email: String,
        @JsonProperty("manufacturer")
        val manufacturerList: List<String>,
        @JsonProperty("order_date")
        val orderDate: String,
        @JsonProperty("order_id")
        val orderId: Int,
        @JsonProperty("products")
        val products: List<Product>,
        @JsonProperty("sku")
        val skuList: List<String>,
        @JsonProperty("taxful_total_price")
        val taxfulTotalPrice: Double,
        @JsonProperty("taxless_total_price")
        val taxlessTotalPrice: Double,
        @JsonProperty("total_quantity")
        val totalQuantity: Int,
        @JsonProperty("total_unique_products")
        val totalUniqueProducts: Int,
        @JsonProperty("type")
        val type: String,
        @JsonProperty("user")
        val user: String,
        @JsonProperty("geoip")
        val geoip: GeoIP,
        @JsonProperty("event")
        val event: Event
)

data class Product(
        @JsonProperty("base_price")
        val basePrice: Double,
        @JsonProperty("discount_percentage")
        val discountPercentage: Int,
        @JsonProperty("quantity")
        val quantity: Int,
        @JsonProperty("manufacturer")
        val manufacturer: String,
        @JsonProperty("tax_amount")
        val taxAmount: Double,
        @JsonProperty("product_id")
        val productId: Int,
        @JsonProperty("category")
        val category: String,
        @JsonProperty("sku")
        val sku: String,
        @JsonProperty("taxless_price")
        val taxlessPrice: Double,
        @JsonProperty("unit_discount_amount")
        val unitDiscountAmount: Double,
        @JsonProperty("min_price")
        val minPrice: Double,
        @JsonProperty("_id")
        val id: String,
        @JsonProperty("discount_amount")
        val discountAmount: Double,
        @JsonProperty("created_on")
        val createdOn: String,
        @JsonProperty("product_name")
        val productName: String,
        @JsonProperty("price")
        val price: Double,
        @JsonProperty("taxful_price")
        val taxfulPrice: Double,
        @JsonProperty("base_unit_price")
        val baseUnitPrice: Double
)

data class GeoIP(
        @JsonProperty("country_iso_code")
        val countryIsoCode: String,
        @JsonProperty("location")
        val location: Location,
        @JsonProperty("region_name")
        val regionName: String,
        @JsonProperty("continent_name")
        val continentName: String,
        @JsonProperty("city_name")
        val cityName: String
)

data class Location(
        @JsonProperty("lon")
        val lon: Double,
        @JsonProperty("lat")
        val lat: Double
)

data class Event(
        @JsonProperty("dataset")
        val dataset: String
)