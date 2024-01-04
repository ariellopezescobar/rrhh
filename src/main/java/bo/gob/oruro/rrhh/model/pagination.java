package bo.gob.oruro.rrhh.model;

public class pagination {
   public Integer per_page;
    public Integer page;
    public String search;
    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer offset;
    public Integer getPer_page() {
        return per_page;
    }
    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }
    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public String getSearch() {
        return search;
    }
    public void setSearch(String search) {
        this.search = search;
    } 
}
