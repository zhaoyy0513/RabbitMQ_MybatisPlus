///**
// * @author zhangsong
// */
//package zhaoyy.integration.vo;
//
//import com.github.pagehelper.Page;
//
//import java.util.List;
//
//public class PageEntity<E> {
//    private int page;
//    private int limit;
//    private long total;
//    private List<E> data;
//
//    public int getPage() {
//        return page;
//    }
//
//    public void setPage(int page) {
//        this.page = page;
//    }
//
//    public int getLimit() {
//        return limit;
//    }
//
//    public void setLimit(int limit) {
//        this.limit = limit;
//    }
//
//    public long getTotal() {
//        return total;
//    }
//
//    public void setTotal(long total) {
//        this.total = total;
//    }
//
//    public List<E> getData() {
//        return data;
//    }
//
//    public void setData(List<E> data) {
//        this.data = data;
//    }
//
//    public static PageEntity getInstance(Page page){
//        PageEntity pageEntity= new PageEntity();
//        pageEntity.setData(page.getResult());
//        pageEntity.setLimit(page.getPageSize());
//        pageEntity.setPage(page.getPageNum());
//        pageEntity.setTotal(page.getTotal());
//        return pageEntity;
//    }
//}
