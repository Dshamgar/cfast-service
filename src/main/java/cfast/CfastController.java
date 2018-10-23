package cfast;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", methods = { RequestMethod.PUT, RequestMethod.GET, RequestMethod.POST,
		RequestMethod.DELETE })
@RestController
@RequestMapping("/cfast-status")
class CfastController {

	@Autowired
	private BoardRepository repository;

	/*
	 * @CrossOrigin
	 * 
	 * @ResponseBody
	 * 
	 * @PostMapping("/cfast-status") Board newBoard(@RequestBody Board inBoard) {
	 * System.out.println("Handling API call!  board: " + inBoard);
	 * 
	 * inBoard.getColumns().get(0).getHexes().get(3).getRaphaelHex().getAttrs().
	 * setFill("red"); inBoard.getColumns().get(0).getHexes().get(3).setColor("2");
	 * return inBoard; }
	 */

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Board modifyBoardById(@PathVariable("id") ObjectId id, @Valid @RequestBody Board board) {
		board.set_id(id);
		repository.save(board);
		return board;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Board> getAllBoards() {
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Board getBoardById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Board createBoard(@Valid @RequestBody Board board) {
		System.out.println("Board: " + board);
		board.set_id(ObjectId.get());
		repository.save(board);
		return board;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteBoard(@PathVariable ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}
}
