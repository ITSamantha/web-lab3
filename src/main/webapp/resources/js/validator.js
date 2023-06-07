const R_VALUES = ["1", "1.5", "2", "2.5", "3"];

const Y_MAX = 5;
const Y_MIN = -3;

function validateR(r) {
    for (let i = 0; i < R_VALUES.length; i++) {
        if (R_VALUES[i] === r) {
            return R_VALUES[i];
        }
    }
    return "R";
}


function validateY(y) {
    return (y > Y_MIN && y <Y_MAX);
}
