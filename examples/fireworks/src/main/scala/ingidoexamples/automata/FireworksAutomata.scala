package ingidoexamples.automata

import indigoexts.subsystems.automata._

object FireworksAutomata {

  def subSystem: Automata =
    Automata.empty
      .add(CrossAutomaton.automaton)
      .add(FuseAutomaton.automaton)
      .add(RocketAutomaton.automaton)

}
