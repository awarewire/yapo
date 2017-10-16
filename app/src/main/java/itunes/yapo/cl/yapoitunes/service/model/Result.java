
package itunes.yapo.cl.yapoitunes.service.model;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Result implements Serializable, Parcelable
{

    private String wrapperType;
    private String kind;
    private long artistId;
    private long collectionId;
    private long trackId;
    private String artistName;
    private String collectionName;
    private String trackName;
    private String collectionCensoredName;
    private String trackCensoredName;
    private long collectionArtistId;
    private String collectionArtistName;
    private String collectionArtistViewUrl;
    private String artistViewUrl;
    private String collectionViewUrl;
    private String trackViewUrl;
    private String previewUrl;
    private String artworkUrl30;
    private String artworkUrl60;
    private String artworkUrl100;
    private double collectionPrice;
    private double trackPrice;
    private String releaseDate;
    private String collectionExplicitness;
    private String trackExplicitness;
    private long discCount;
    private long discNumber;
    private long trackCount;
    private long trackNumber;
    private long trackTimeMillis;
    private String country;
    private String currency;
    private String primaryGenreName;
    private boolean isStreamable;
    public final static Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Result createFromParcel(Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
    ;
    private final static long serialVersionUID = -4691711489772646870L;

    protected Result(Parcel in) {
        this.wrapperType = ((String) in.readValue((String.class.getClassLoader())));
        this.kind = ((String) in.readValue((String.class.getClassLoader())));
        this.artistId = ((long) in.readValue((long.class.getClassLoader())));
        this.collectionId = ((long) in.readValue((long.class.getClassLoader())));
        this.trackId = ((long) in.readValue((long.class.getClassLoader())));
        this.artistName = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionName = ((String) in.readValue((String.class.getClassLoader())));
        this.trackName = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionCensoredName = ((String) in.readValue((String.class.getClassLoader())));
        this.trackCensoredName = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionArtistId = ((long) in.readValue((long.class.getClassLoader())));
        this.collectionArtistName = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionArtistViewUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.artistViewUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionViewUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.trackViewUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.previewUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.artworkUrl30 = ((String) in.readValue((String.class.getClassLoader())));
        this.artworkUrl60 = ((String) in.readValue((String.class.getClassLoader())));
        this.artworkUrl100 = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionPrice = ((double) in.readValue((double.class.getClassLoader())));
        this.trackPrice = ((double) in.readValue((double.class.getClassLoader())));
        this.releaseDate = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionExplicitness = ((String) in.readValue((String.class.getClassLoader())));
        this.trackExplicitness = ((String) in.readValue((String.class.getClassLoader())));
        this.discCount = ((long) in.readValue((long.class.getClassLoader())));
        this.discNumber = ((long) in.readValue((long.class.getClassLoader())));
        this.trackCount = ((long) in.readValue((long.class.getClassLoader())));
        this.trackNumber = ((long) in.readValue((long.class.getClassLoader())));
        this.trackTimeMillis = ((long) in.readValue((long.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.currency = ((String) in.readValue((String.class.getClassLoader())));
        this.primaryGenreName = ((String) in.readValue((String.class.getClassLoader())));
        this.isStreamable = ((boolean) in.readValue((boolean.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param collectionExplicitness
     * @param trackCensoredName
     * @param artworkUrl60
     * @param discCount
     * @param collectionId
     * @param collectionArtistViewUrl
     * @param trackTimeMillis
     * @param wrapperType
     * @param collectionViewUrl
     * @param trackName
     * @param collectionArtistId
     * @param kind
     * @param currency
     * @param releaseDate
     * @param artistId
     * @param collectionCensoredName
     * @param collectionName
     * @param trackCount
     * @param trackId
     * @param artworkUrl30
     * @param primaryGenreName
     * @param trackNumber
     * @param discNumber
     * @param country
     * @param trackExplicitness
     * @param previewUrl
     * @param artistViewUrl
     * @param trackPrice
     * @param isStreamable
     * @param artistName
     * @param artworkUrl100
     * @param collectionArtistName
     * @param trackViewUrl
     * @param collectionPrice
     */
    public Result(String wrapperType, String kind, long artistId, long collectionId, long trackId, String artistName, String collectionName, String trackName, String collectionCensoredName, String trackCensoredName, long collectionArtistId, String collectionArtistName, String collectionArtistViewUrl, String artistViewUrl, String collectionViewUrl, String trackViewUrl, String previewUrl, String artworkUrl30, String artworkUrl60, String artworkUrl100, double collectionPrice, double trackPrice, String releaseDate, String collectionExplicitness, String trackExplicitness, long discCount, long discNumber, long trackCount, long trackNumber, long trackTimeMillis, String country, String currency, String primaryGenreName, boolean isStreamable) {
        super();
        this.wrapperType = wrapperType;
        this.kind = kind;
        this.artistId = artistId;
        this.collectionId = collectionId;
        this.trackId = trackId;
        this.artistName = artistName;
        this.collectionName = collectionName;
        this.trackName = trackName;
        this.collectionCensoredName = collectionCensoredName;
        this.trackCensoredName = trackCensoredName;
        this.collectionArtistId = collectionArtistId;
        this.collectionArtistName = collectionArtistName;
        this.collectionArtistViewUrl = collectionArtistViewUrl;
        this.artistViewUrl = artistViewUrl;
        this.collectionViewUrl = collectionViewUrl;
        this.trackViewUrl = trackViewUrl;
        this.previewUrl = previewUrl;
        this.artworkUrl30 = artworkUrl30;
        this.artworkUrl60 = artworkUrl60;
        this.artworkUrl100 = artworkUrl100;
        this.collectionPrice = collectionPrice;
        this.trackPrice = trackPrice;
        this.releaseDate = releaseDate;
        this.collectionExplicitness = collectionExplicitness;
        this.trackExplicitness = trackExplicitness;
        this.discCount = discCount;
        this.discNumber = discNumber;
        this.trackCount = trackCount;
        this.trackNumber = trackNumber;
        this.trackTimeMillis = trackTimeMillis;
        this.country = country;
        this.currency = currency;
        this.primaryGenreName = primaryGenreName;
        this.isStreamable = isStreamable;
    }

    public String getWrapperType() {
        return wrapperType;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(long collectionId) {
        this.collectionId = collectionId;
    }

    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    public long getCollectionArtistId() {
        return collectionArtistId;
    }

    public void setCollectionArtistId(long collectionArtistId) {
        this.collectionArtistId = collectionArtistId;
    }

    public String getCollectionArtistName() {
        return collectionArtistName;
    }

    public void setCollectionArtistName(String collectionArtistName) {
        this.collectionArtistName = collectionArtistName;
    }

    public String getCollectionArtistViewUrl() {
        return collectionArtistViewUrl;
    }

    public void setCollectionArtistViewUrl(String collectionArtistViewUrl) {
        this.collectionArtistViewUrl = collectionArtistViewUrl;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public double getCollectionPrice() {
        return collectionPrice;
    }

    public void setCollectionPrice(double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    public double getTrackPrice() {
        return trackPrice;
    }

    public void setTrackPrice(double trackPrice) {
        this.trackPrice = trackPrice;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    public long getDiscCount() {
        return discCount;
    }

    public void setDiscCount(long discCount) {
        this.discCount = discCount;
    }

    public long getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(long discNumber) {
        this.discNumber = discNumber;
    }

    public long getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(long trackCount) {
        this.trackCount = trackCount;
    }

    public long getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(long trackNumber) {
        this.trackNumber = trackNumber;
    }

    public long getTrackTimeMillis() {
        return trackTimeMillis;
    }

    public void setTrackTimeMillis(long trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    public boolean isIsStreamable() {
        return isStreamable;
    }

    public void setIsStreamable(boolean isStreamable) {
        this.isStreamable = isStreamable;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(wrapperType);
        dest.writeValue(kind);
        dest.writeValue(artistId);
        dest.writeValue(collectionId);
        dest.writeValue(trackId);
        dest.writeValue(artistName);
        dest.writeValue(collectionName);
        dest.writeValue(trackName);
        dest.writeValue(collectionCensoredName);
        dest.writeValue(trackCensoredName);
        dest.writeValue(collectionArtistId);
        dest.writeValue(collectionArtistName);
        dest.writeValue(collectionArtistViewUrl);
        dest.writeValue(artistViewUrl);
        dest.writeValue(collectionViewUrl);
        dest.writeValue(trackViewUrl);
        dest.writeValue(previewUrl);
        dest.writeValue(artworkUrl30);
        dest.writeValue(artworkUrl60);
        dest.writeValue(artworkUrl100);
        dest.writeValue(collectionPrice);
        dest.writeValue(trackPrice);
        dest.writeValue(releaseDate);
        dest.writeValue(collectionExplicitness);
        dest.writeValue(trackExplicitness);
        dest.writeValue(discCount);
        dest.writeValue(discNumber);
        dest.writeValue(trackCount);
        dest.writeValue(trackNumber);
        dest.writeValue(trackTimeMillis);
        dest.writeValue(country);
        dest.writeValue(currency);
        dest.writeValue(primaryGenreName);
        dest.writeValue(isStreamable);
    }

    public int describeContents() {
        return  0;
    }

    @Override
    public String toString() {
        return "Result{" +
                "wrapperType='" + wrapperType + '\'' +
                ", kind='" + kind + '\'' +
                ", artistId=" + artistId +
                ", collectionId=" + collectionId +
                ", trackId=" + trackId +
                ", artistName='" + artistName + '\'' +
                ", collectionName='" + collectionName + '\'' +
                ", trackName='" + trackName + '\'' +
                ", collectionCensoredName='" + collectionCensoredName + '\'' +
                ", trackCensoredName='" + trackCensoredName + '\'' +
                ", collectionArtistId=" + collectionArtistId +
                ", collectionArtistName='" + collectionArtistName + '\'' +
                ", collectionArtistViewUrl='" + collectionArtistViewUrl + '\'' +
                ", artistViewUrl='" + artistViewUrl + '\'' +
                ", collectionViewUrl='" + collectionViewUrl + '\'' +
                ", trackViewUrl='" + trackViewUrl + '\'' +
                ", previewUrl='" + previewUrl + '\'' +
                ", artworkUrl30='" + artworkUrl30 + '\'' +
                ", artworkUrl60='" + artworkUrl60 + '\'' +
                ", artworkUrl100='" + artworkUrl100 + '\'' +
                ", collectionPrice=" + collectionPrice +
                ", trackPrice=" + trackPrice +
                ", releaseDate='" + releaseDate + '\'' +
                ", collectionExplicitness='" + collectionExplicitness + '\'' +
                ", trackExplicitness='" + trackExplicitness + '\'' +
                ", discCount=" + discCount +
                ", discNumber=" + discNumber +
                ", trackCount=" + trackCount +
                ", trackNumber=" + trackNumber +
                ", trackTimeMillis=" + trackTimeMillis +
                ", country='" + country + '\'' +
                ", currency='" + currency + '\'' +
                ", primaryGenreName='" + primaryGenreName + '\'' +
                ", isStreamable=" + isStreamable +
                '}';
    }
}
