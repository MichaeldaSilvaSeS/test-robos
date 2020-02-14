package feature;

import java.awt.MouseInfo;
import java.awt.event.InputEvent;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AplicacaoTeste {
	
	@Given("Abrir a aplicacao de cadastro de usuario")
	public void abrir_a_aplicacao_de_cadastro_de_usuario() throws IOException, InterruptedException {
	    Runtime.getRuntime().exec(this.getClass().getClassLoader().getResource("programa.exe").getFile());
	    Thread.currentThread().sleep(1000L);
	    System.out.println("AQUI!!!1");	    
	}
	
	@Given("^informado ([^\\\"]*) do usuario$")
	public void informado_nome_do_usuario(String nome) throws InterruptedException {
		System.out.println("AQUI!!!2");
		RobotUtils.moveMouse(950, 480);
		RobotUtils.sendMouseKeys(InputEvent.BUTTON1_DOWN_MASK);
		RobotUtils.sendKeys(nome);
	}
	
	@When("pressionar salvar")
	public void pressionar_salvar() {
		for(int count = 0; count <= 120; count+=10 )
			RobotUtils.moveMouse(950 + count, 500 + count);
		RobotUtils.sendMouseKeys(InputEvent.BUTTON1_DOWN_MASK);
	}

	
	@Then("^1informa ([^\\\"]*) para o usuario$")
	public void informa_Sucesso_para_o_usuario(String resultado) throws InterruptedException {
		RobotUtils.sendMouseKeys(InputEvent.BUTTON1_DOWN_MASK);
		int x = MouseInfo.getPointerInfo().getLocation().x;
		int y = MouseInfo.getPointerInfo().getLocation().y;
		RobotUtils.moveMouse(x - 50, y - 20);
		Thread.currentThread().sleep(500L);
		RobotUtils.sendMouseKeys(InputEvent.BUTTON1_DOWN_MASK);
		Thread.currentThread().sleep(500L);
		RobotUtils.moveMouse(x, 425);
		RobotUtils.sendMouseKeys(InputEvent.BUTTON1_DOWN_MASK);
	}

}
