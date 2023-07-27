package pjh5365.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pjh5365.board.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
