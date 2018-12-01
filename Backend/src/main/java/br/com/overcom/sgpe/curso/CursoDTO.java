package br.com.overcom.sgpe.curso;

import br.com.overcom.sgpe.abstracao.AbstractDTO;
import br.com.overcom.sgpe.seguranca.configuration.UsuarioDTO;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class CursoDTO extends AbstractDTO {

	private String     nome;
	private UsuarioDTO coordenador;

	@QueryProjection
	@Builder
	public CursoDTO(UUID uuid, String nome, UsuarioDTO coordenador) {
		super(uuid);
		this.nome = nome;
		this.coordenador = coordenador;
	}

	@QueryProjection
	public CursoDTO(UUID uuid, String nome) {
		super(uuid);
		this.nome = nome;
	}
}
