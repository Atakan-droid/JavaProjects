package atakandroid.hrms.core.services;



public interface MernisCheckService<T> {
	 boolean isMernis(T entity);
	 boolean isPasswordCorrect(T entity);
}
