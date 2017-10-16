
package itunes.yapo.cl.yapoitunes.service.model;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ItunesSearch implements Serializable, Parcelable
{

    private long resultCount;
    private List<Result> results = null;
    public final static Creator<ItunesSearch> CREATOR = new Creator<ItunesSearch>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ItunesSearch createFromParcel(Parcel in) {
            return new ItunesSearch(in);
        }

        public ItunesSearch[] newArray(int size) {
            return (new ItunesSearch[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8676847333012042572L;

    protected ItunesSearch(Parcel in) {
        this.resultCount = ((long) in.readValue((long.class.getClassLoader())));
        in.readList(this.results, (itunes.yapo.cl.yapoitunes.service.model.Result.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public ItunesSearch() {
    }

    /**
     * 
     * @param results
     * @param resultCount
     */
    public ItunesSearch(long resultCount, List<Result> results) {
        super();
        this.resultCount = resultCount;
        this.results = results;
    }

    public long getResultCount() {
        return resultCount;
    }

    public void setResultCount(long resultCount) {
        this.resultCount = resultCount;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(resultCount);
        dest.writeList(results);
    }

    public int describeContents() {
        return  0;
    }

    @Override
    public String toString() {
        return "ItunesSearch{" +
                "resultCount=" + resultCount +
                ", results=" + results +
                '}';
    }
}
