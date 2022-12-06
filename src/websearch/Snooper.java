package websearch;

/**
 * Watches the search queries
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        model.addQueryObserver( new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("son long... " + query);
            }
        }, new WebSearchModel.FilterSearch() {
			
			@Override
			public boolean filter(String query) {
				// TODO Auto-generated method stub
				return query.length()>60;
			}
		});
        
        model.addQueryObserver( new WebSearchModel.QueryObserver() {
			
			@Override
			public void onQuery(String query) {
				// TODO Auto-generated method stub
				System.out.println("Oh Yes" + query);
			}
		},
        		new WebSearchModel.FilterSearch() {

					@Override
					public boolean filter(String query) {
						// TODO Auto-generated method stub
						return query.toLowerCase().contains("friend");
					}
			
		});
    }
}
