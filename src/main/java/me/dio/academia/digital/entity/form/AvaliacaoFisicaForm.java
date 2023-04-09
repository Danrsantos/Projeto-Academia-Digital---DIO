package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @NotNull(message = "Preencha o campo corretamente!.")
  @Positive(message = "O Id informado é inválido")
  private Long alunoId;

  @NotNull(message = "Preencha o campo corretamente!.")
  @Positive(message = "O peso informado é inválido")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente!.")
  @Positive(message = "A altura informado é inválida")
  private double altura;
}
