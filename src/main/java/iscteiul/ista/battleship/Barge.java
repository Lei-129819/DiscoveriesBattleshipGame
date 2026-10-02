/**
 *
 */
package iscteiul.ista.battleship;

/**
 *
 * Representa o navio do tipo Barca no jogo Discoveries Battleship Game.
 * Na frota da época dos Descobrimentos, a Barca ocupa 1 quadrado e cada jogador tem 4 unidades
 */
public class Barge extends Ship {
    private static final Integer SIZE = 1;
    private static final String NAME = "Barca";

    /**
     * @param bearing - barge bearing
     * @param pos     - upper left position of the barge
     */
    public Barge(Compass bearing, IPosition pos) {
        super(Barge.NAME, bearing, pos);
        getPositions().add(new Position(pos.getRow(), pos.getColumn()));
    }

    @Override
    public Integer getSize() {
        return SIZE;
    }

}
