package hand.Exam_12808_20161229_1.service.impl;

import hand.Exam_12808_20161229_1.bean.Film;
import hand.Exam_12808_20161229_1.mapper.FilmMapper;
import hand.Exam_12808_20161229_1.service.IFilmService;

public class FilmServiceImpl implements IFilmService{

	//注入FilmMapper对象
	private FilmMapper filmmapper;
	
	@Override
	public void savafilm(Film film) {
		filmmapper.savaFilm(film);
	}
	
	
	//get/set方法
	public FilmMapper getFilmmapper() {
		return filmmapper;
	}
	public void setFilmmapper(FilmMapper filmmapper) {
		this.filmmapper = filmmapper;
	}
	
	

}
