package org.dacapo.lusearch;

public class Main {
    public static void main(String[] args) throws Exception {
        Search search = new Search();
        Search.QueryProcessor processor = search.new QueryProcessor(
                search, "Query0", 0, "index", "out", "query", "contents", null, false, 10);
        processor.run();
    }
}