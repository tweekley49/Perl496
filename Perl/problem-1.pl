%months = (january=>1, february=>2, march=>3, april=>4, may=>5, june=>6, july=>7,
	   august=>8, september=>9, october=>10, november=>11, december=>12);

@dates = qw(january 15 February 12 SEPTEMBER 15 september 18);
@dates2 = qw(january 15 February 12 january 18 SEPTEMBER 15 september 18);
@dates3 = qw(january 15 February 12 February 11 SEPTEMBER 15 september 18);

print checkDates(@dates), "\n";
print checkDates(@dates2), "\n";
print checkDates(@dates3), "\n";

sub checkDates {
  my $lastM=$months{lc $_[0]};
  my $lastD=$_[1];
  my ($currentM, $currentD);
  for (my $d=2; $d<@_; $d+=2) {
  	$currentM = $months{lc $_[$d]};
  	$currentD = $_[$d+1];
	return "Out Of Order ", $d/2 if ($lastM > $currentM || ($lastM==$currentM && $lastD > $currentD));
	$lastM=$currentM;
	$lastD=$currentD;
  }
  return "In Order";
}

sub checkDates2 {#uglier, but with no temporary variables
  for (my $d=2; $d<@_; $d+=2) {
	if ($months{lc $_[$d-2]} > $months{lc $_[$d]} || 
		($months{lc $_[$d-2]} == $months{lc $_[$d]} && $_[$d-1] > $_[$d+1])) {
	  return "Out Of Order ", $d/2; 
	}
  }
  return "In Order";
}