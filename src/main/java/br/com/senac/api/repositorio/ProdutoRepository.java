package br.com.senac.api.repositorio;

import br.com.senac.api.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query("select c from produto c where nome like %:nome%")
    public List<Produto> findByNome(@Param("nome") String nome);

    @Query("select c from produto c where codigoEan like %:codigoEan%")
    public List<Produto> findByCodigoEan(@Param("codigoEan") String codigoEan);
}
