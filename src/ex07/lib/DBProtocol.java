package ex07.lib;

public interface DBProtocol {
    void setUrl(String url);

    int execute(String sql);
}
