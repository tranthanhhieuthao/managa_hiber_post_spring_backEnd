package managa_HieuThao.repository_Manga;

import java.util.List;

public interface manga_repository<T> {
	List<T> findAll();
	T findById(long id);
	void save(T model);
	void remove(long id);

}
