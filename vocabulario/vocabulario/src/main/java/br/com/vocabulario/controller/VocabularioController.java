package br.com.vocabulario.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vocabulario.model.VocabularioModel;
import br.com.vocabulario.repository.VocabularioRepository;
import br.com.vocabulario.service.IdSequenciador;

@RestController
@RequestMapping("/pares")
public class VocabularioController {

	@Autowired
	private VocabularioRepository repository;

	@PostMapping
	public ResponseEntity<Void> cadastrar(@RequestBody VocabularioModel vocabulario) {
		repository.save(vocabulario);
		return ResponseEntity.status(201).build();
	}

	@PutMapping
	public ResponseEntity<Void> atualizar(@RequestBody VocabularioModel vocabulario) {
		if (!repository.existsById(vocabulario.getId())) {
			return ResponseEntity.notFound().build();
		}
		repository.save(vocabulario);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable int id) {
		if (!repository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		repository.deleteById(id);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public List<VocabularioModel> listarTudo() {
		return repository.findAll();
	}

	@GetMapping("/listar30")
	public List<VocabularioModel> listar30() {
		return repository.findTop30ByOrderByIdAsc();
	}

	@GetMapping("/total")
	public long contarElementos() {
		return repository.count();
	}

	@GetMapping("/portugues/{id}")
	public ResponseEntity<String> obterPortugues(@PathVariable int id) {
		return repository.buscarPortuguesPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/ingles/{id}")
	public ResponseEntity<String> obterIngles(@PathVariable int id) {
		return repository.buscarInglesPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/ingles")
	public List<String> listarTodosIngles() {
		return repository.listarTodasPalavrasIngles();
	}

	@GetMapping("/buscarId/{portugues}")
	public ResponseEntity<VocabularioModel> obterPorPortugues(@PathVariable String portugues) {
		return repository.findByPortugues(portugues).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@Autowired
	private IdSequenciador sequenciador;

	@GetMapping("/aleatorio")
	public ResponseEntity<VocabularioModel> sortearPar() {
		Integer idSorteado = sequenciador.sortearIdSemRepetir();
		Optional<VocabularioModel> vocab = repository.findById(idSorteado);
		return vocab.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

//	@Autowired
//	private VocabularioRepository vocabularioDAO;
//
//	@GetMapping
//	public List<VocabularioModel> listarTudo() {
//		return vocabularioDAO.selectAll();
//	}
//
//	@GetMapping("/listar30")
//	public List<VocabularioModel> listar30() {
//		return vocabularioDAO.select30Elementos();
//	}
//
//	@PostMapping
//	public ResponseEntity<Void> cadastrar(@RequestBody VocabularioModel vocabulario) {
//		vocabularioDAO.insert(vocabulario);
//		return ResponseEntity.status(HttpStatus.CREATED).build();
//	}
//
//	@PutMapping
//	public ResponseEntity<Void> atualizar(@RequestBody VocabularioModel vocabulario) {
//		vocabularioDAO.update(vocabulario);
//		return ResponseEntity.ok().build();
//	}
//
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> excluir(@PathVariable int id) {
//		vocabularioDAO.delete(id);
//		return ResponseEntity.ok().build();
//	}
//
//	@GetMapping("/existe/{id}")
//	public boolean existeId(@PathVariable int id) {
//		return vocabularioDAO.existeId(id);
//	}
//
//	@GetMapping("/portugues/{id}")
//	public String obtemPalavraPortugues(@PathVariable int id) {
//		return vocabularioDAO.obtemPortugues(id);
//	}
//
//	@GetMapping("/ingles/{id}")
//	public String obtemPalavraIngles(@PathVariable int id) {
//		return vocabularioDAO.obtemIngles(id);
//	}
//
//	@GetMapping("/ingles")
//	public List<VocabularioModel> obtemTodosIngles() {
//		return vocabularioDAO.obtemTodosIngles();
//	}
//
//	@GetMapping("/buscarId/{portugues}")
//	public VocabularioModel obtemId(@PathVariable String portugues) {
//		return vocabularioDAO.validaCadastro(portugues);
//	}
//
//	@GetMapping("/total")
//	public int selectQtdElementosTabela() {
//		return vocabularioDAO.selectQtdElementosColuna();
//	}
//
//	@GetMapping("/aleatorio")
//	public int aleatorizaSequencia() {
//		int qtdElementos = vocabularioDAO.selectQtdElementosColuna();
//		Random random = new Random();
//		return random.nextInt(qtdElementos) + 1;
//	}

}
