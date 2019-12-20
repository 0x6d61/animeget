package main.java.animeget.FetchAnimeData;

public class AnimeData {
    private Integer id;
    private String title;
    private String title_short1;
    private String title_short2;
    private String title_short3;
    private String public_url;
    private String twitter_account;
    private String twitter_hash_tag;
    private Integer cours_id;
    private String created_at;
    private String updated_at;
    private Integer sex;
    private Integer sequel;
    private Integer city_code;
    private String city_name;
    private String product_companies;  

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_short1() {
        return this.title_short1;
    }

    public void setTitle_short1(String title_short1) {
        this.title_short1 = title_short1;
    }

    public String getTitle_short2() {
        return this.title_short2;
    }

    public void setTitle_short2(String title_short2) {
        this.title_short2 = title_short2;
    }

    public String getTitle_short3() {
        return this.title_short3;
    }

    public void setTitle_short3(String title_short3) {
        this.title_short3 = title_short3;
    }

    public String getPublic_url() {
        return this.public_url;
    }

    public void setPublic_url(String public_url) {
        this.public_url = public_url;
    }

    public String getTwitter_account() {
        return this.twitter_account;
    }

    public void setTwitter_account(String twitter_account) {
        this.twitter_account = twitter_account;
    }

    public String getTwitter_hash_tag() {
        return this.twitter_hash_tag;
    }

    public void setTwitter_hash_tag(String twitter_hash_tag) {
        this.twitter_hash_tag = twitter_hash_tag;
    }

    public Integer getCours_id() {
        return this.cours_id;
    }

    public void setCours_id(Integer cours_id) {
        this.cours_id = cours_id;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getSequel() {
        return this.sequel;
    }

    public void setSequel(Integer sequel) {
        this.sequel = sequel;
    }

    public Integer getCity_code() {
        return this.city_code;
    }

    public void setCity_code(Integer city_code) {
        this.city_code = city_code;
    }

    public String getCity_name() {
        return this.city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getProduct_companies() {
        return this.product_companies;
    }

    public void setProduct_companies(String product_companies) {
        this.product_companies = product_companies;
    }

    public AnimeData id(Integer id) {
        this.id = id;
        return this;
    }

    public AnimeData title(String title) {
        this.title = title;
        return this;
    }

    public AnimeData title_short1(String title_short1) {
        this.title_short1 = title_short1;
        return this;
    }

    public AnimeData title_short2(String title_short2) {
        this.title_short2 = title_short2;
        return this;
    }

    public AnimeData title_short3(String title_short3) {
        this.title_short3 = title_short3;
        return this;
    }

    public AnimeData public_url(String public_url) {
        this.public_url = public_url;
        return this;
    }

    public AnimeData twitter_account(String twitter_account) {
        this.twitter_account = twitter_account;
        return this;
    }

    public AnimeData twitter_hash_tag(String twitter_hash_tag) {
        this.twitter_hash_tag = twitter_hash_tag;
        return this;
    }

    public AnimeData cours_id(Integer cours_id) {
        this.cours_id = cours_id;
        return this;
    }

    public AnimeData created_at(String created_at) {
        this.created_at = created_at;
        return this;
    }

    public AnimeData updated_at(String updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public AnimeData sex(Integer sex) {
        this.sex = sex;
        return this;
    }

    public AnimeData sequel(Integer sequel) {
        this.sequel = sequel;
        return this;
    }

    public AnimeData city_code(Integer city_code) {
        this.city_code = city_code;
        return this;
    }

    public AnimeData city_name(String city_name) {
        this.city_name = city_name;
        return this;
    }

    public AnimeData product_companies(String product_companies) {
        this.product_companies = product_companies;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", title_short1='" + getTitle_short1() + "'" +
            ", title_short2='" + getTitle_short2() + "'" +
            ", title_short3='" + getTitle_short3() + "'" +
            ", public_url='" + getPublic_url() + "'" +
            ", twitter_account='" + getTwitter_account() + "'" +
            ", twitter_hash_tag='" + getTwitter_hash_tag() + "'" +
            ", cours_id='" + getCours_id() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", updated_at='" + getUpdated_at() + "'" +
            ", sex='" + getSex() + "'" +
            ", sequel='" + getSequel() + "'" +
            ", city_node='" + getCity_code() + "'" +
            ", city_name='" + getCity_name() + "'" +
            ", product_companies='" + getProduct_companies() + "'" +
            "}";
    }
}

