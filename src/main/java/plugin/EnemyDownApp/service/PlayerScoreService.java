package plugin.EnemyDownApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plugin.EnemyDownApp.mapper.PlayerScoreMapper;
import plugin.EnemyDownApp.mapper.data.GameConfig;
import plugin.EnemyDownApp.mapper.data.PlayerScore;

@Service
public class PlayerScoreService {

  private final PlayerScoreMapper mapper;

  public PlayerScoreService(PlayerScoreMapper mapper) {
    this.mapper = mapper;
  }

  public List<PlayerScore> searchPlayerScoreList() {
    return mapper.selectPlayerScoreList();
  }
}
