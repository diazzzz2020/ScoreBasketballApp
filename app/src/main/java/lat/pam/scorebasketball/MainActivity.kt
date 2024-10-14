package lat.pam.scorebasketball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Variables to store the scores
    private var scoreTeamA = 0
    private var scoreTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // References to views
        val scoreTeamATextView: TextView = findViewById(R.id.score_team_a)
        val scoreTeamBTextView: TextView = findViewById(R.id.score_team_b)
        val buttonTeamAOnePoint: Button = findViewById(R.id.button_team_a_one_point)
        val buttonTeamATwoPoints: Button = findViewById(R.id.button_team_a_two_points)
        val buttonTeamAThreePoints: Button = findViewById(R.id.button_team_a_three_points)
        val buttonTeamBOnePoint: Button = findViewById(R.id.button_team_b_one_point)
        val buttonTeamBTwoPoints: Button = findViewById(R.id.button_team_b_two_points)
        val buttonTeamBThreePoints: Button = findViewById(R.id.button_team_b_three_points)
        val resetButton: Button = findViewById(R.id.button_reset)

        // Team A buttons listeners
        buttonTeamAOnePoint.setOnClickListener {
            scoreTeamA += 1
            scoreTeamATextView.text = scoreTeamA.toString()
        }

        buttonTeamATwoPoints.setOnClickListener {
            scoreTeamA += 2
            scoreTeamATextView.text = scoreTeamA.toString()
        }

        buttonTeamAThreePoints.setOnClickListener {
            scoreTeamA += 3
            scoreTeamATextView.text = scoreTeamA.toString()
        }

        // Team B buttons listeners
        buttonTeamBOnePoint.setOnClickListener {
            scoreTeamB += 1
            scoreTeamBTextView.text = scoreTeamB.toString()
        }

        buttonTeamBTwoPoints.setOnClickListener {
            scoreTeamB += 2
            scoreTeamBTextView.text = scoreTeamB.toString()
        }

        buttonTeamBThreePoints.setOnClickListener {
            scoreTeamB += 3
            scoreTeamBTextView.text = scoreTeamB.toString()
        }

        // Reset button listener
        resetButton.setOnClickListener {
            scoreTeamA = 0
            scoreTeamB = 0
            scoreTeamATextView.text = scoreTeamA.toString()
            scoreTeamBTextView.text = scoreTeamB.toString()
        }
    }
}