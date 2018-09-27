package cfast;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
class CfastController {

	@CrossOrigin
	@ResponseBody
	@PostMapping("/cfast-status")
	Board newBoard(@RequestBody Board inBoard) {
		System.out.println("Handling API call!  board: " + inBoard);

		inBoard.getColumns().get(0).getHexes().get(3).getRaphaelHex().getAttrs().setFill("red");
		inBoard.getColumns().get(0).getHexes().get(3).setColor("2");
		return inBoard;
	}
}
