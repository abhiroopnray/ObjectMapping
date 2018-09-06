package objmain;

public class ObjectMapperMain {

    private static GetObjectFromJSON getJson = null;
    private static GetObjectFromJsonFromAPI getJsonFromAPI = null;

    public static void main(String[] args) {
        getJson = new GetObjectFromJSON();
        getJsonFromAPI = new GetObjectFromJsonFromAPI();

        createJsonFromApp();
        createJsonFromAPI();
    }

    private static void createJsonFromApp(){
        getJson.objectToJsonCarModel();

    }

    private static void createJsonFromAPI(){
        getJsonFromAPI.fetchDataFromApi();
    }
}
