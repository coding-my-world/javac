package 图书管理系统;

/**
 * 全部图书
 *
 * @author cuihaoran
 * @date 2020/6/1-19:07
 */
public class book {
    private String name, sort;
    private int count;

    public book(String name, String sort, int count) {
        this.name = name;
        this.sort = sort;

        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
