package br.com.senac.api.repositorio;

import br.com.senac.api.entidades.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    @Query("select c from produtos c where nome like %:nome%")
    public List<Produtos> findByNome(@Param("nome") String nome);

    @Query("select c from produtos c where codigoEan like %:codigoEan%")
    public List<Produtos> findByCodigoEan(@Param("codigoEan") String codigoEan);
}
